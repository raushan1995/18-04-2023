import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {RouterModule, Routes} from '@angular/router';
import {MatToolbarModule} from '@angular/material/toolbar';

import {MatCardModule} from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import {MatInputModule} from '@angular/material/input';
import {FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import {MatSelectModule} from '@angular/material/select';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Covid19Component } from './covid19/covid19.component';

const appRoutes: Routes = [
  {path: '', component: Covid19Component, pathMatch: 'full'}
];

@NgModule({
  declarations: [
    AppComponent,
    Covid19Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatSelectModule,
    
    MatCardModule,
    HttpClientModule,
    MatButtonModule,
    MatInputModule,
    FormsModule,
    [RouterModule.forRoot(appRoutes)]
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
