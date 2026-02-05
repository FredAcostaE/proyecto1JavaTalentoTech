import { Component } from '@angular/core';

/* Liubrerias a importar */
import { UserService } from '../../../services/user.service/user.service';
import { CommonModule, JsonPipe } from '@angular/common';
import { ChangeDetectorRef } from '@angular/core';

/* Decorador */
@Component({
  selector: 'app-user.component',
  imports: [JsonPipe, CommonModule],
  templateUrl: './user.component.html',
  styleUrl: './user.component.css',
  
})
export class UserComponent {
  users: any[] = []; /* Esta linea llama un arreglo llamado users en lenguaje json  */
  constructor(private userServi: UserService, private cdt:ChangeDetectorRef){
     this.userServi.getUsers().subscribe(data=>{
      this.users=data;
      console.log(this.users);   
      this.cdt.detectChanges();  //Llamando al detector para refrescar los cambios
    });
  };
}
