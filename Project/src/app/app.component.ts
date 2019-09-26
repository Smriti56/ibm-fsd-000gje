import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import { ChartsModule} from 'ng2-charts';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{

  constructor(private router: Router) {}
  ngOnInit(): void {
    this.router.navigate(['/index']);
  }
  title = 'fitnessTracker-angular';

  
}
