import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import 'rxjs/add/operator/map';


@Injectable()
export class PaisesService {

 constructor(private http:HttpClient) {}

   getPaises(){
     let url="http://localhost:8080/api/paises";
     return this.http.get(url).map(res=> res);

 }
}
