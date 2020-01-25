import { Component } from '@angular/core';
import { VirtualTimeScheduler } from 'rxjs';
import { ThrowStmt } from '@angular/compiler';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  private firstn : number = null;
  private secondn: number = null;
  private result : number = null;

  public constructor(){
    this.firstn = this.firstn;
    this.secondn = this.secondn;
  }
  
  public add(): number{
   this.result = this.firstn+this.secondn;
  return this.result;
  }
  public sub() : number{
    this.result = this.firstn-this.secondn;
    return this.result;
  }
  public mul() : number{
    this.result = this.firstn*this.secondn;
    return this.result;
  }
  public div() : number{
    this.result = this.firstn/this.secondn;
    return this.result;
  }
  }
  
