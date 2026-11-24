import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { OlaComponent } from './ola/ola.component';
import { BemVindoComponent } from './bem-vindo/bem-vindo.component';
import { FormsModule } from '@angular/forms';
import { CantorCardComponent } from './cantor-card/cantor-card.component';

@NgModule({
  declarations: [
    AppComponent,
    OlaComponent,
    BemVindoComponent,
    CantorCardComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent, OlaComponent]
})
export class AppModule { }
