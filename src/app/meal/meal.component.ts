import { Component, OnInit, Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Feed } from '../model/feed';
import { map } from 'rxjs/operators';
import { HttpClient } from '@angular/common/http';
import * as CryptoJS from 'crypto-js';
@Injectable({
  providedIn: 'root'
})

@Component({
  selector: 'app-meal',
  templateUrl: './meal.component.html',
  styleUrls: ['./meal.component.css']
})
export class MealComponent implements OnInit {

  user : any
  _url: any
  meal : any
  private feedUrl: string = 'https://www.who.int/rss-feeds/news-english.xml';
  private rssToJsonServiceBaseUrl: string = 'https://rss2json.com/api.json?rss_url='
private feed:any;
private feeds :any;

  constructor(private router : Router,private http: HttpClient) { }

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
          this.refreshFeed(); 
        })
      })
    }
      signout(){
        localStorage.removeItem("token");
        this.router.navigate(['login']);
    
      }

      refreshFeed() {
        // Adds 1s of delay to provide user's feedback.
        this.getFeedContent(this.feedUrl)
            .subscribe(
              feed => this.feeds = feed.items,
                
                );
      }
     
      
      
    
      getFeedContent(url: string): Observable<Feed> {
        return this.http.get(this.rssToJsonServiceBaseUrl + url)
                .pipe(map(this.extractFeeds));
                
    
      }
      private extractFeeds(res: Response): Feed {
        this.feed = res;
        return this.feed;
      }

}

