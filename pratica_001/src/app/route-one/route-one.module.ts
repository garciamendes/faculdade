import { RouterModule, Routes } from "@angular/router";
import { NgModule } from "@angular/core";
import { RouteOneComponent } from "./route-one.component";
import { ChildRouteOneComponent } from "./child-route-one/child-route-one.component";

const routes: Routes = [
  {
    path: '',
    component: RouteOneComponent,
    children: [
      { path: 'child-one', component: ChildRouteOneComponent}
    ]
  },
  { path: '', redirectTo: '/one', pathMatch: 'full' },
  { path: '**', component: RouteOneComponent },
]

@NgModule({
  imports: [RouterModule.forChild(routes)],
  declarations: [RouteOneComponent, ChildRouteOneComponent]
})

export class OneModule {}