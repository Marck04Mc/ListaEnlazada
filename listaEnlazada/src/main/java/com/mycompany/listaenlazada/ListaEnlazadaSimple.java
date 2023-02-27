/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.listaenlazada;

import javax.swing.JOptionPane;

/**
 *
 * @author 1103858627
 */
public class ListaEnlazadaSimple {

    public static void llenar(Nodo nod) {
        
        int cod = Integer.parseInt(JOptionPane.showInputDialog("Digite CODIGO del estudiante:"));
        nod.setCodigo(cod);
        
        String nom = JOptionPane.showInputDialog("Digite NOMBRE del estudiante:");
        nod.setNombre(nom);
        
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota  1:"));
        nod.setN1(n1);
        
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota  2:"));
        nod.setN2(n2);
        
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite nota  3:"));
        nod.setN3(n3);
        
        
        
        
    }
    public static void mostrar(Nodo nod) {
        
        String datosNodos = "";
        
        datosNodos = datosNodos+String.valueOf(""+"CODIGO:   "+nod.getCodigo()+"\n"+"NOMBRE:  "+nod.getNombre()+"\n"
        +"NOTA 1:  "+nod.getN1()+"\n"+"NOTA 2: "+nod.getN2()+"\n"+"NOTA 3: "+nod.getN3()+"DEFINITIVA: "+nod.definitiva()+"\n"+"\n"
        );
        JOptionPane.showMessageDialog(null, "===============INFORMACION DE LOS NODO DE LA LISTA==============="+"\n"+datosNodos);
    }
    public static void listar(Nodo nod) {
        
        Nodo temp = nod;
        
        while (temp != null) {            
            
            mostrar(temp);
            temp = temp.getSiguiente();
        }
    }
    public static int menu(){
        
        int opcion = 0; do {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("========================MENU========================"+"\n"+
                    "1. Insertar un estudiante a la lista"+"\n"+
                    "2. Mostrar estudiante de la lista"+"\n"+
                    "2. Buscar estudiante de la lista"+"\n"+
                    "4. Cantidad de estudiante de la lista"+"\n"+
                    "5. Eliminar estudiante de la lista"+"\n"+
                    "6. Informe: Promedio Genera y Maxima nota"+"\n"+
                    "7. Eliminar un estudiante de la lista"+"\n"+
                    "8. Salir"+"\n"+"\n"+
                    "Seleccione una opcion del 1 al 8"
                    ));
        } while (opcion <=0 || opcion>8);
        return opcion;
    }
    
    public static void main(String[] args) {
        int opcion = 0;
        int cod = 0;
        ListaEnlazada lis = new ListaEnlazada();
        Nodo aux;do {  
            
        opcion = menu();switch (opcion) {
            case 1:
                aux = new Nodo();
                lis.agregar(aux);
                break;
            case 2:
                if (lis.getCabeza() != null) {
                    
                    listar(lis.getCabeza());
                }else{
                    
                    JOptionPane.showInputDialog(null,"La lista esta vacia");
                }break;case 3:
                    JOptionPane.showInputDialog(null, "===========================NUMERO DE NODO DE LA LISTA==========================="
                            +"\n"+lis.contarNodos()+"NODOS");break;
                
                case 4:
                cod =  Integer.parseInt(JOptionPane.showInputDialog("Digite CODOGI del estudiante a buscar"));
                aux = lis.buscar(cod);
                    if (aux != null) {
                        
                        mostrar(aux);
                    }else{
                    
                        JOptionPane.showMessageDialog(null, "La informacion no se encuentra en la lista");
                    }
                    break;
                case 5:
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Digite Codigo del estudiante a eliminar"));
                    aux = lis.buscar(cod);
                    if (aux != null) {
                        
                        lis.eliminar(aux);
                        JOptionPane.showMessageDialog(null, "La informacion fue eliminada");
                    } else {
                        
                        JOptionPane.showMessageDialog(null, "El codigo del estudiante NO EXISTE en la lista");
                    }break;
                    
                case 6:
                    
                    JOptionPane.showMessageDialog(null, "===============INFORME PROMEDIO GENERAL Y MAXIMA NOTA===================="+
                            "\n\n"+
                            "Promedio general: "+lis.promedioGeneral()+"\n Y nota maxima"+lis.maximaDefinitiva());
                    break;
                case 7:
                    lis.limpiar();
                    JOptionPane.showMessageDialog(null, "Se ha vaciado la lista");
        }
            
        } while (opcion != 8);
    }

    
    
    }


