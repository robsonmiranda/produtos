package br.com.alura.service;

import br.com.alura.model.Produto;
import space.dynomake.libretranslate.Language;
import space.dynomake.libretranslate.Translator;

public class TraduzProdutoService {
    public void traduzir(Produto produto) {
        try {
            String nome = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getName());
            String descricao = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getDescription());
            String categoria = Translator.translate(Language.ENGLISH, Language.PORTUGUESE, produto.getCategory());
            produto.setName(nome);
            produto.setDescription(descricao);
            produto.setCategory(categoria);
        } catch (Exception e) {
            System.out.println(">>> Falha ao traduzir: " + e.getMessage());
        }
    }
}
