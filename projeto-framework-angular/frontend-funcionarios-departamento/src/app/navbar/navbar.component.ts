import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
  menuVisivel = false;

  alternarMenu(): void {
    this.menuVisivel = !this.menuVisivel;
  }
}
