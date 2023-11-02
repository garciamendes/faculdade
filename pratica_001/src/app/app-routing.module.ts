import { RouterModule, Routes } from "@angular/router";
import { RouteOneComponent } from "./route-one/route-one.component";
import { RouteTwoComponent } from "./route-two/route-two.component";
import { NotFoundComponent } from "./not-found/not-found.component";
import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";

const routes: Routes = [
  { path: 'one', loadChildren: () => import('./route-one/route-one.module').then(m => m.OneModule) },
  { path: 'two', component: RouteTwoComponent },
  { path: '', redirectTo: '/one', pathMatch: 'full' },
  { path: '**', component: NotFoundComponent },
]

@NgModule({
  imports: [BrowserModule, RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class RoutingModule {}