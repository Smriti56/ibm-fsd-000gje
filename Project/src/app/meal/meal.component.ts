import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-meal',
  templateUrl: './meal.component.html',
  styleUrls: ['./meal.component.css']
})
export class MealComponent implements OnInit {

  user : any
  _url: any
  meal : any

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
        this._url = `http://localhost:8010/meal/`
        fetch(this._url+data.category,{
            method : "GET",
            headers: {
                "content-type": "application/json"
              }
            })
        .then(res=>res.json())
        .then(result=>{
          this.meal = result;
          console.log(this.meal);
            
        })
      })
    }
      signout(){
        localStorage.removeItem("email");
        this.router.navigate(['login']);
    
      }

}

