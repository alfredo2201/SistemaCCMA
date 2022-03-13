/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import DAO.ClienteDAO;
import DAO.EmpleadosDAO;
import Dominio.Empleado;
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class Pruebas {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
                ClienteDAO CDAO = new ClienteDAO();
                EmpleadosDAO EDAO = new EmpleadosDAO();
                
//                Empleado em = new Empleado("Angel","Hernandez","angel_213@gmail.com","xxXPUSSYDESTROYERXxx","contraseñauwu",Permiso.ADMIN);
//                Empleado em2 = new Empleado("Jesus","Arenas","angel_212223@gmail.com","xxXPUSSYDESTROYERXxx2","contraseñauwu2",Permiso.EMPLEADO);
//                EDAO.insertar(em);
//                EDAO.insertar(em2);
                
//                Empleado emactualizar = new Empleado(1,"Pepe","Picapapas","angel_212223@gmail.com","asdfg","contraseñauwu2",Permiso.EMPLEADO);
//                EDAO.actualizar(emactualizar);
//                
                
                
//                Empleado pruebaConsulta = EDAO.consultarById(1L);
//                System.out.println(pruebaConsulta.getIdUsuario());
//                System.out.println(pruebaConsulta.getNombre());
//                System.out.println(pruebaConsulta.getApellidos());
//                System.out.println(pruebaConsulta.getCorreo());
//                System.out.println(pruebaConsulta.getUsername());
//                System.out.println(pruebaConsulta.getPassword());
//                System.out.println(pruebaConsulta.getPermiso());

//            EDAO.eliminar(1L);

        ArrayList<Empleado> listaEmpleados = EDAO.consultar();
        for (int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println(listaEmpleados.get(i).getIdUsuario());
            System.out.println(listaEmpleados.get(i).getNombre());
            System.out.println(listaEmpleados.get(i).getApellidos());
            System.out.println(listaEmpleados.get(i).getCorreo());
            System.out.println(listaEmpleados.get(i).getUsername());
            System.out.println(listaEmpleados.get(i).getPassword());
            System.out.println(listaEmpleados.get(i).getPermiso());
        }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
//        Cliente c1 = new Cliente("Isai","Borbon", "isailol2201@gmail.com","CFRE0987251L3", "6682107900");
//        try {
//            CDAO.insertar(c1);
//            System.out.println("Se agrego correctamente");
//        } catch (Exception ex) {
//            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
//        }



//        Cliente c1 = new Cliente(1,"Isai","Borbon", "isailol2201@gmail.com","CFRE0987251L3", "6682107900");
//        try {
//            CDAO.actualizar(c1);
//            System.out.println("actualizao <3");
//        } catch (Exception ex) {
//            Logger.getLogger(Pruebas.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        
        
//        Cliente cliente = CDAO.consultarById(2L);
//        System.out.println(cliente.getId_cliente());
//        System.out.println(cliente.getNombre());
//        System.out.println(cliente.getApellidos());
//        System.out.println(cliente.getRfc());
//        System.out.println(cliente.getCorreo());
//        System.out.println(cliente.getTelefono());
        
        
        
//          CDAO.eliminar(1L);
        
        
        
//        ArrayList<Cliente> listaClientes = CDAO.consultar();
//        for (int i = 0; i < listaClientes.size(); i++) {
//            System.out.println(listaClientes.get(i).getId_cliente());
//            System.out.println(listaClientes.get(i).getNombre());
//            System.out.println(listaClientes.get(i).getApellidos());
//            System.out.println(listaClientes.get(i).getRfc());
//            System.out.println(listaClientes.get(i).getCorreo());
//            System.out.println(listaClientes.get(i).getTelefono());
//        }
        


//        Cliente cliente = CDAO.consultarByRFC("CFRE0987251L3");
//        System.out.println(cliente.getId_cliente());
//        System.out.println(cliente.getNombre());
//        System.out.println(cliente.getApellidos());
//        System.out.println(cliente.getRfc());
//        System.out.println(cliente.getCorreo());
//        System.out.println(cliente.getTelefono());
        
   
        
        
//        Producto prod=new Producto("Tipo pesado","Mofle de carro bien bonito ","STEREN",
//        "G24RL",2010,1000.0f);
//        ProductosDAO PDAO= new ProductosDAO();
//        PDAO.insertar(prod);
        
        
        
          
    }
    
}
