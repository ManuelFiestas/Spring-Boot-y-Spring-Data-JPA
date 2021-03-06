import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from "./components/home/home.component";
import {AboutComponent} from "./components/about/about.component";
import {PaisesComponent} from "./components/paises/paises.component";

const APP_ROUTES: Routes = [
  { path: 'home', component: HomeComponent },
  { path: 'about', component: AboutComponent },
  { path: 'paises', component: PaisesComponent },
  { path: '**', pathMatch: 'full', redirectTo: 'home' }
];

export const APP_ROUTING = RouterModule.forRoot(APP_ROUTES);
