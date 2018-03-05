import { Component, OnInit } from '@angular/core';
import {PaisesService} from "../services/paises.service";

@Component({
  selector: 'app-paises',
  templateUrl: './paises.component.html'
})
export class PaisesComponent implements OnInit {

  paises:any = [];

  constructor( private _paisesService:PaisesService) { }

  ngOnInit() {
    this._paisesService.getPaises().subscribe(
      data => {this.paises = data}
    );
  }

}
