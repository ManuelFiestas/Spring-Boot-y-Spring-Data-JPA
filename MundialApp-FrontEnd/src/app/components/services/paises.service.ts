import { Injectable } from '@angular/core';
import {Http} from "@angular/http";
import 'rxjs/add/operator/map';


@Injectable()
export class PaisesService {

 constructor(private http:Http) {}

   getPaises(){
     let url="http://localhost:8080/api/paises";
     return this.http.get(url).map(res=> res.json());

 }
}
