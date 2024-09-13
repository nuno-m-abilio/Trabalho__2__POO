/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;
import AcessoMedico.*;
import AcessoSecretaria.*;
import Mensageiros.*;
import inteface.telas.Tela1;
import java.util.ArrayList;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("asda");
        Medico medico = new Medico();
        Secretaria secretaria = new Secretaria();
        Tela1 tela1 = new Tela1(emf,medico,secretaria);
        
    }
}

        