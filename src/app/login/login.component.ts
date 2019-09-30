import { Component, OnInit, ElementRef, ViewChild } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { __importDefault } from 'tslib';
import * as CryptoJS from 'crypto-js';
import { stringify } from '@angular/compiler/src/util';
import { AuthService, GoogleLoginProvider } from 'angular4-social-login';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  @ViewChild('openModal',undefined) openModal:ElementRef;
  @ViewChild('openModal1',undefined) openModal1:ElementRef;
  @ViewChild('modal',undefined) modal:ElementRef;
  @ViewChild('closeAddExpenseModal',undefined) close1:ElementRef;
  @ViewChild('closeAddExpenseModal1',undefined) close2:ElementRef;
  @ViewChild('closeAddExpenseModal2',undefined) close3:ElementRef;
  editObj : editObj
  _url : any
  error: any
  error1: any
  emailObj: emailObj
  emailObj1: emailObj1
  email: any
  user: any;
  constructor( private route:ActivatedRoute,private router:Router, private _socioAuthServ: AuthService) { }

  ngOnInit() {
    
    }
  

  edit(editObj ){
   
        if((editObj.email == "") || (editObj.password=="")){

      this.error = "Please Enter Username and Password";
      this.router.navigate(['login']);

        }
else{
    this._url = `http://localhost:8010/login`
    fetch(this._url,{
        method : "POST",
        headers: {
            "content-type": "application/json"
           },
        body : JSON.stringify({
            email : editObj.email,
            password : editObj.password
        })
    })
    .then(res=>res.json())
    .then(data=>{
      if(data.message!=null){
        this.error = data.message;
        this.router.navigate(['login']);
      }
      
      else{                 
        var encr = CryptoJS.AES.encrypt(data.email,"randomPassphrase");
        localStorage.setItem("token" , encr.toString());
        this.router.navigate(['home']);
          }
    })
}}


changepassword(emailObj ,event : Event){
  event.preventDefault();
  this.email = emailObj.email;
  if((emailObj.email == "")){
    this.error1 = "Please Enter Username";
   
      }
else{
  this._url = `http://localhost:8010/password`
  fetch(this._url,{
      method : "POST",
      headers: {
          "content-type": "application/json"
         },
      body : JSON.stringify({
         email : emailObj.email
      })
  })
  .then(res=>res.json())
  .then(data=>{ 
    if(data.message == "please enter valid Email"){
      this.error1 = data.message; 
     
    }
    else{
      this.error1 = data.message;
      this.close1.nativeElement.click(); 
      this.openModal.nativeElement.click();
        }
  })
}
}



loginPassword(emailObj1 ,event : Event){
  event.preventDefault();
  if((emailObj1.password == "")){
    this.error1 = "Please Enter token";
   
      }
else{
  this._url = `http://localhost:8010/loginbyBcrypt`
  fetch(this._url,{
      method : "POST",
      headers: {
          "content-type": "application/json"
         },
      body : JSON.stringify({
         email : this.email,
         password : emailObj1.password
      })
  })
  .then(res=>res.json())
  .then(data=>{ 
    if(data.message !=null){
      this.error1 = data.message; 
     
    }
    else{
      this.close2.nativeElement.click(); 
      this.openModal1.nativeElement.click();
        }
  })
}
}


updatePassword(emailObj1 ,event : Event){
  event.preventDefault();
  if((emailObj1.password == "")){
    this.error1 = "Please Enter password";
   
      }
else{
  this._url = `http://localhost:8010/updatePassword`
  fetch(this._url,{
      method : "POST",
      headers: {
          "content-type": "application/json"
         },
      body : JSON.stringify({
         email : this.email,
         password : emailObj1.password
      })
  })
  .then(res=>res.json())
  .then(data=>{ 
    if(data.message !=null){
      this.error1 = data.message; 
     
    }
    else{
      alert('password changed successfull. please login again');
      this.close3.nativeElement.click(); 
      
        }
  })
}
}

signin(): void {
  let platform = GoogleLoginProvider.PROVIDER_ID;
  this._socioAuthServ.signIn(platform).then(
    (response) => {
      this.user = response,
        this._url = `http://localhost:8010/loginWithGmail`
      fetch(this._url, {
        method: "POST",
        headers: {
          "content-type": "application/json"
        },
        body: JSON.stringify({
          email: this.user.email,

        })
      })
        .then(res => res.json())
        .then(data => {
          if (data.message != null) {
            this.error = data.message;
            this.router.navigate(['login']);
          }
          else {
            var encr = CryptoJS.AES.encrypt(data.email,"randomPassphrase");
        localStorage.setItem("token" , encr.toString());
            this.router.navigate(['home']);
          }
        })


    }
  );
}
}

interface editObj{
  email : String
  password : String
}

interface emailObj{
  email : String
}

interface emailObj1{
  password : String
}

