/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;
import sistemabibliograficos.Articulo;
import sistemabibliograficos.Autor;
import sistemabibliograficos.Congreso;
import sistemabibliograficos.Copia;
import sistemabibliograficos.Rama;
import sistemabibliograficos.InformeTecnico;
import sistemabibliograficos.Revista;
import sistemabibliograficos.Usuario;
import crud.ArticuloCrud;
import crud.CongresoCrud;
import crud.AutorCrud;
import crud.CopiaCrud;
import crud.InformeTecnicoCrud;
import crud.RamaCrud;
import crud.RevistaCrud;
import crud.UsuarioCrud;
/**
 *
 * @author usuario1
 */
public class Principal {
    public static void main (String []args){
    
        Articulo Articulo1= new Articulo ("racismo",1600,"libertad, esclavitud rebelion","historico");

        ArticuloCrud.agregar(Articulo1);

       
        System.out.println(" tema del articulo: ");
       // Articulo1.setTitulo("libertad");//
        System.out.println(Articulo1.getTitulo());
    
        Autor Autor1= new Autor ("Emiro","colombiano",23,"filosofica");
        
        System.out.println("datos del autor:");
        Autor1.setNombre("andres");
        System.out.println(Autor1.getEdad());
        
        Congreso Congreso1 = new Congreso("derechos civiles actuales", "Cartagena", 2024, "derechos civiles");

        System.out.println("Información del congreso:");
        Congreso1.setNombre("Derechos humanos");
        System.out.println(Congreso1.getNombre());

        
        
        Copia Copia1 = new Copia ("fisica", "estanteria a", true);
        
        System.out.println("informacion de la copia");
        Copia1.setDisponibilidad(true);
        System.out.println(Copia1.isDisponibilidad());
        
        
        InformeTecnico InformeTecnico1= new InformeTecnico ("INF12345","El Impacto del Cambio Climático en el mundo","Este informe aborda cómo el cambio climático afecta el planeta","Centro de Estudio climatico","Mayo",2023,"Estante 5, Sección A, Biblioteca Principal",true);
        
        System.out.println("Informe tecnico");
        InformeTecnico1.setTitulo("resumen");
        System.out.println(InformeTecnico1.getResumen());
        
        Rama Rama1= new Rama ("filosofia","ensayo","universidad de los Cartagena","este documento habla sobre la filosofia a lo largo de los tiempos");
        
        System.out.println("genero del documento");
        Rama1.setDescripcion("descripcion");
        System.out.println(Rama1.getTipoDocumento());
        
        Revista Revista1= new Revista ("el espectador","social","estante a nivel b",2);
        
        System.out.println("datos de la revista");
        Revista1.setNombreRevista("nombreRevista");
        System.out.println(Revista1.getRama());
        
        Usuario Usuario1= new Usuario ("andres","andres31","andres31@gmail");
        
        System.out.println("datos de usuario");
        Usuario1.setUsername("andres31");
        System.out.println(Usuario1.getNombre());
        
        System.out.println("\n--- ACTUALIZANDO ARTÍCULO ---");
        // Crear un nuevo objeto con los datos actualizados
        Articulo nuevoArticulo1 = new Articulo("racismo", 2022, "libertad, derechos humanos", "histórico social");

        // Intentar actualizar el artículo por su título original
        boolean actualizado = ArticuloCrud.actualizar("racismo", nuevoArticulo1);

        if (actualizado) {
        System.out.println("✅ Artículo actualizado exitosamente.");
        } else {
        System.out.println("❌ No se encontró el artículo para actualizar.");
        }

      // Mostrar lista actualizada
        System.out.println("--- Lista de artículos luego de actualización ---");
        for (Articulo a : ArticuloCrud.listarTodo()) {
        System.out.println("Título: " + a.getTitulo() + " | Tipo: " + a.getTipo());
        }   

        System.out.println("\n--- ELIMINANDO ARTÍCULO ---");
        // Intentar eliminar el artículo por su título
        boolean eliminado = ArticuloCrud.eliminar("racismo");

        if (eliminado) {
        System.out.println("✅ Artículo eliminado correctamente.");
        } else {
        System.out.println("❌ No se encontró el artículo para eliminar.");
        }

        // Mostrar lista actualizada
        System.out.println("--- Lista de artículos luego de eliminación ---");
        for (Articulo a : ArticuloCrud.listarTodo()) {
        System.out.println("Título: " + a.getTitulo() + " | Tipo: " + a.getTipo());
        }
       
        CongresoCrud.agregar(Congreso1);

        System.out.println("--- Lista de Congresos ---");
        for (Congreso c : CongresoCrud.listarTodo()) {
        System.out.println("Nombre: " + c.getNombre() + " | Ciudad: " + c.getCiudad());
        }
    
        Autor Autor = new Autor("Emiro", "colombiano", 23, "filosofica");
        AutorCrud.agregar(Autor);

        System.out.println("--- Lista de Autores ---");
        for (Autor a : AutorCrud.listarTodo()) {
        System.out.println("Nombre: " + a.getNombre() + " | Nacionalidad: " + a.getNacionalidad());
        }
        
        Copia copia1 = new Copia("fisica", "estanteria a", true);
        CopiaCrud.agregar(copia1);

        System.out.println("--- Lista de Copias ---");
        for (Copia c : CopiaCrud.listarTodo()) {
        System.out.println("Ubicación: " + c.getUbicacion() + " | Disponible: " + c.isDisponibilidad());
        }


        Copia nuevaCopia = new Copia("fisica", "estanteria a", false);
        if (CopiaCrud.actualizar("estanteria a", nuevaCopia)) {
        System.out.println("✅ Copia actualizada.");
        }

        if (CopiaCrud.eliminar("estanteria a")) {
        System.out.println("✅ Copia eliminada.");
        }
        
        InformeTecnico informe1 = new InformeTecnico(
        "INF12345",
        "El Impacto del Cambio Climático en el mundo",
        "Este informe aborda cómo el cambio climático afecta el planeta",
        "Centro de Estudio Climático",
        "Mayo",
        2023,
        "Estante 5, Sección A, Biblioteca Principal",
        true
        );
        InformeTecnicoCrud.agregar(informe1);

        // Mostrar informes
        System.out.println("--- Lista de Informes Técnicos ---");
        for (InformeTecnico i : InformeTecnicoCrud.listarTodo()) {
        System.out.println("Título: " + i.getTitulo() + " | Año: " + i.getAño());
        }

        // Actualizar informe
        InformeTecnico nuevoInforme = new InformeTecnico(
        "INF12345",
        "Cambio Climático Global",
        "Análisis actualizado de los efectos globales del cambio climático",
        "Centro Global de Clima",
        "Junio",
        2024,
        "Estante 7, Biblioteca Central",
        false
         );
        if (InformeTecnicoCrud.actualizar("El Impacto del Cambio Climático en el mundo", nuevoInforme)) {
        System.out.println("✅ Informe actualizado.");
        }

        // Eliminar
        if (InformeTecnicoCrud.eliminar("Cambio Climático Global")) {
        System.out.println("✅ Informe eliminado.");
        }
        
        Rama rama1 = new Rama("filosofia", "ensayo", "universidad de los Cartagena", "este documento habla sobre la filosofia a lo largo de los tiempos");
        RamaCrud.agregar(rama1);

        System.out.println("--- Lista de Ramas ---");
        for (Rama r : RamaCrud.listarTodo()) {
        System.out.println("Género: " + r.getGenero() + " | Tipo: " + r.getTipoDocumento());
        }

        // Actualizar
        Rama nuevaRama = new Rama("filosofia", "tesis", "Universidad Nacional", "Una revisión profunda de las ramas filosóficas");
        if (RamaCrud.actualizar("filosofia", nuevaRama)) {
         System.out.println("✅ Rama actualizada.");
        }

        // Eliminar
        if (RamaCrud.eliminar("filosofia")) {
         System.out.println("✅ Rama eliminada.");
        }
        
        Revista revista1 = new Revista("El Espectador", "social", "Estante A", 2);
        RevistaCrud.agregar(revista1);

        System.out.println("--- Lista de Revistas ---");
        for (Revista r : RevistaCrud.listarTodo()) {
        System.out.println("Nombre: " + r.getNombreRevista() + " | Rama: " + r.getRama());
        }

        // Actualizar revista
        Revista nuevaRevista = new Revista("El Espectador", "cultural", "Estante C", 3);
        boolean revistaActualizada = RevistaCrud.actualizar("El Espectador", nuevaRevista);

        if (revistaActualizada) {
         System.out.println("✅ Revista actualizada correctamente.");
        } else {
        System.out.println("❌ Revista no encontrada para actualizar.");
        }

        // Eliminar revista
        boolean revistaEliminada = RevistaCrud.eliminar("El Espectador");

        if (revistaEliminada) {
        System.out.println("✅ Revista eliminada correctamente.");
        } else {
        System.out.println("❌ Revista no encontrada para eliminar.");
        }
        
        Usuario u1 = new Usuario("Carlos", "carlitos01", "carlos@gmail.com");
        UsuarioCrud.agregar(u1);

        // Mostrar usuarios
        System.out.println("--- Lista de Usuarios ---");
        for (Usuario u : UsuarioCrud.listarTodo()) {
        System.out.println("Nombre: " + u.getNombre() + " | Correo: " + u.getCorreo());
        }

        // Actualizar usuario
        Usuario nuevoUsuario = new Usuario("Carlos", "carlitoNuevo", "carlos@gmail.com");
        actualizado = UsuarioCrud.actualizar("carlos@gmail.com", nuevoUsuario);

        if (actualizado) {
        System.out.println("✅ Usuario actualizado correctamente.");
        } else {
         System.out.println("❌ Usuario no encontrado para actualizar.");
        }

        // Eliminar usuario
        eliminado = UsuarioCrud.eliminar("carlos@gmail.com");

        if (eliminado) {
        System.out.println("✅ Usuario eliminado correctamente.");
        }   
        else {
        System.out.println("❌ Usuario no encontrado para eliminar.");
        }
    
    
        }
        }   
