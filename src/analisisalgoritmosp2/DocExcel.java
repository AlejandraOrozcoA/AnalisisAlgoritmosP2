

package analisisalgoritmosp2;

import java.io.FileOutputStream;
import java.io.OutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DocExcel {

    public DocExcel(String ar[][], String l) {
        this.Escribir(ar,l);
    }
    
    public void Escribir(String ar[][], String l){
        
        String nombreArchivo = "src/Documentos/"+l+".xlsx"; //Directorio en que se va aguardar 
        String hoja = "hoja 1"; //Nomre de la hoja 
        XSSFWorkbook libro = new XSSFWorkbook(); //Crea el libro
        XSSFSheet hoja1 = libro.createSheet(hoja); //Crea la Hoja 

        //Contenido de la hoja 
        String[][] documento = ar;
        
        for (int i = 0; i < documento.length ; i++) {
            XSSFRow row = hoja1.createRow(i); //Crea las filas 
            for (int j = 0; j < 2 ; j++) {
                    XSSFCell cell = row.createCell(j);
                    cell.setCellValue(documento[i][j]);
            }
        }
        
        //Crea el Documento 
        try(OutputStream fileOut = new FileOutputStream(nombreArchivo)){
            System.out.println("Se creo el archivo");
            libro.write(fileOut);
        } catch (Exception e) {
            System.out.println("Error al crear el Archivo");
        }
        
    } 
}
