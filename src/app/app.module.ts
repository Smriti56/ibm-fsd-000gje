import { StripHtmlTagsPipe } from './pipe/strip-html-tags.pipe';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { ModalModule } from 'ngx-bootstrap/modal';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { SocialLoginModule, AuthServiceConfig, GoogleLoginProvider } from 'angular4-social-login';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { HomeComponent } from './home/home.component';
import { IndexComponent } from './index/index.component';
import { MealComponent } from './meal/meal.component';
import { PaidSignupComponent } from './paid-signup/paid-signup.component';
import { ProfileComponent } from './profile/profile.component';
import { HttpClientModule } from '@angular/common/http';
import { TrackComponent } from './track/track.component';
import {ChartsModule} from 'ng2-charts';
const google_oauth_client_id:string = '69341315168-op2qts24gbjmhpe593pd42e8cl2nvacv.apps.googleusercontent.com';
let config = new AuthServiceConfig([
  {
    id: GoogleLoginProvider.PROVIDER_ID,
    provider: new GoogleLoginProvider(google_oauth_client_id)
  }
]);
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SignupComponent,
    HomeComponent,
    IndexComponent,
    MealComponent,
    PaidSignupComponent,
    ProfileComponent,
    StripHtmlTagsPipe,
    TrackComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot(),
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    ChartsModule,
    SocialLoginModule.initialize(config)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
