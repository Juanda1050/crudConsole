package semana3;

import java.util.*;

public class TiendaAbarrotes
{
    ArrayList<Articulo> articlesList = new ArrayList<>();

    public static void main(String[] args)
    {
        int optionUser;
        Scanner sc = new Scanner(System.in);
        TiendaAbarrotes ta = new TiendaAbarrotes();
        do
        {
            System.out.println("\t\tMENU\t\t");
            System.out.println("[1] Ingresar Articulo");
            System.out.println("[2] Modificar Articulo");
            System.out.println("[3] Borrar Articulo");
            System.out.println("[4] Consultar Articulos");
            System.out.println("[5] Salir");
            System.out.print("Opcion: ");
            optionUser = sc.nextInt();
            switch(optionUser)
            {
                case 1: ta.registrarArt();
                break;
                case 2: ta.modificarArt();
                break;
                case 3: ta.eliminarArt();
                break;
                case 4: ta.listarArt();
                break;
                case 5:
                    System.out.println("Vuelva pronto!");
                    System.exit(0);

            }
        }while(optionUser > 0 && optionUser < 6);
    }

    private void registrarArt()
    {
        Scanner sc = new Scanner(System.in);
            System.out.print("Clave: ");
            int cve = Integer.parseInt(sc.nextLine());
            System.out.print("Nombre: ");
            String nom = sc.nextLine();
            System.out.print("Categoria: ");
            int cat = Integer.parseInt(sc.nextLine());
            System.out.print("Proveedor: ");
            int prov = Integer.parseInt(sc.nextLine());
            System.out.print("Precio: ");
            float pre = Float.parseFloat(sc.nextLine());
            System.out.print("Inventario: ");
            int inv = Integer.parseInt(sc.nextLine());
            articlesList.add(new Articulo(cve, nom, cat, prov, pre, inv));
    }

    private void modificarArt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la clave del articulo: ");
        int idArticle = sc.nextInt();
        for(Articulo product : articlesList)
        {
            if(product.getCve_art() != idArticle)
            {
                continue;
            }

            System.out.print("Clave: ");
            product.setCve_art(sc.nextInt());
            sc.nextLine();
            System.out.print("Nombre: ");
            product.setNom_art(sc.nextLine());
            System.out.print("Categoria: ");
            product.setCat_art(sc.nextInt());
            System.out.print("Proveedor: ");
            product.setProv_art(sc.nextInt());
            System.out.print("Precio: ");
            product.setPre_art(sc.nextFloat());
            System.out.print("Inventario: ");
            product.setInv_art(sc.nextInt());

        }
    }

    private void eliminarArt()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la clave del articulo que quieres eliminar: ");
        int idArticle = sc.nextInt();
        try{
            articlesList.removeIf(articulo -> articulo.getCve_art() == idArticle);
            System.out.println("Articulo eliminado correctamente");
        }catch (Exception e)
        {
            System.out.println("Error en la eliminación");
        }

    }

    private void listarArt()
    {
        if(!articlesList.isEmpty())
        {
            Collections.sort(articlesList);
            System.out.println("Clave\t\tNombre\t\tCategoria\t\tProveedor\t\tPrecio\t\tInventario");
            for(Articulo product : articlesList)
            {
                System.out.println(product);
            }
        }
        else
        {
            System.out.println("No existen valores dentro de la lista de articulos");
        }
    }

}
