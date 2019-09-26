import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
 
 user : any
  _url: any
  workout : any

  constructor(private router : Router) { }

  ngOnInit() {
    this._url = `http://localhost:8010/search`
    fetch(this._url,{
        method : "POST",
        headers: {
            "content-type": "application/json"
           },
        body : JSON.stringify({
            email :localStorage.getItem("email")
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
            
        })
      })
  
  }

  signout(){
    localStorage.removeItem("email");
    this.router.navigate(['login']);

  }
}
