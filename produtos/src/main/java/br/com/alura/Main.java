package br.com.alura;

import br.com.alura.model.Produto;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Produto> produtos = new CsvToBeanBuilder(new FileReader("src/main/resources/products.csv")).withType(Produto.class).build().parse();
        produtos.forEach(System.out::println);
    }
}