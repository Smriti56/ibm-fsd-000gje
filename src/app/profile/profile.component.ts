import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import * as CryptoJS from 'crypto-js';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  user : any
  _url: any

  constructor(private router : Router) { }

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
    })
  }

  signout(){
    localStorage.removeItem("token");
    this.router.navigate(['login']);

  }
}
