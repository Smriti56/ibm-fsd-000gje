import { Component, OnInit } from '@angular/core';
import { Router ,ActivatedRoute} from '@angular/router'; 
import { ChartsModule} from 'ng2-charts';
import * as CryptoJS from 'crypto-js';


@Component({
  selector: 'app-track',
  templateUrl: './track.component.html',
  styleUrls: ['./track.component.css']
})
export class TrackComponent  {

  
 user : any
 _url: any
 workout : any
 dayId :any
 exercise : any
 actualAmount :any[]=[]
 doneAmount:any[]=[]
 v : any[]=[];

 public chartType: string = 'line';

  constructor(private router:Router,private activatedRoute: ActivatedRoute) {
    this.activatedRoute.params.subscribe(params => { this.dayId = params['id']; });
   }

   public barChartOptions = {
    scaleShowVerticalLines: false,
    responsive: true,
    scales: {
      yAxes: [{
          ticks: {
              beginAtZero:true
          }
      }]
  }
  };
  
  public barChartLabels = [];
  public barChartType = 'bar';
  public barChartLegend = true;
  public barChartData = [
    {data: [], label: 'expected'},
    {data: [], label: 'actual'}
  ];

  ngOnInit() {
    



    this._url = `http://localhost:8010/search`
    var dec = CryptoJS.AES.decrypt(localStorage.getItem("token"),"randomPassphrase");
    fetch(this._url,{
        method : "POST",
        headers: {
            "content-type": "application/json"
           },
        body : JSON.stringify({
            email :dec.toString(CryptoJS.enc.Utf8)
        })
    })
    .then(res=>res.json())
    .then(data=>{
     this.user = data
        this._url = `http://localhost:8010/workout/`
        fetch(this._url+data.category,{
            method : "GET",
            headers: {
                "content-type": "application/json"
              }
            })
        .then(res=>res.json())
        .then(result=>{
          this.workout = result;
          this.exercise= this.workout[this.dayId-1].workout
          //console.log(this.exercise[0].exerciseName)
            
        })
      })
  
  }

  getValues(v)
  {
    this.barChartData[0].data = []
    this.barChartData[1].data =[]
    this.doneAmount=[]
    this.actualAmount=[]
    this.barChartLabels=[]
  
    this.doneAmount=Object.values(v);
    //console.log(this.doneAmount)
    var i;


     for(i=0;i<this.workout[this.dayId-1].workout.length;i++)
     {
      this.actualAmount.push(this.exercise[i].amount);
     }

     //console.log(this.actualAmount)
     var i;
     for(i=0;i<this.workout[this.dayId-1].workout.length;i++)
     {
      this.barChartLabels.push(this.exercise[i].exerciseName);
     }
    console.log(this.barChartLabels)
    this.barChartData[0].data = this.actualAmount
    this.barChartData[1].data = this.doneAmount
   // console.log(this.barChartData[0])
    //console.log(this.barChartData[1])
  }

  
  signout(){
    localStorage.removeItem("token");
    this.router.navigate(['login']);

  }

  
}

