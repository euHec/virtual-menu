package com.betrybe.trybevirtualmenu.models

import com.betrybe.trybevirtualmenu.R

object TrybeMenuDataBase {
    private val dishes = listOf(
        Dishes(
            id = 1,
            name = "File de Carne com Fritas",
            image = R.drawable.prato_01,
            description = "Uma suculenta porção de filé de carne grelhado na perfeição, servido com deliciosas batatas fritas crocantes. Uma explosão de sabor que vai satisfazer seus desejos mais carnívoros.",
            price = 65.00,
        ),
        Dishes(
            id = 2,
            name = "Frango Grelhado com Legumes",
            image = R.drawable.prato_02,
            description = "Uma opção saudável e saborosa: peitos de frango suculentos grelhados à perfeição, acompanhados de legumes frescos, preparados para manter a crocância e o sabor. Uma refeição leve e deliciosa para quem busca um toque de frescor.",
            price = 45.00,
        ),
        Dishes(
            id = 3,
            name = "Mix de File de Carne e Frango Grelhados",
            image = R.drawable.prato_03,
            description = "A melhor escolha para os indecisos! Uma combinação harmoniosa de filé de carne suculento e peito de frango grelhado, oferecendo uma explosão de sabores em cada garfada. Acompanhado de opções de molhos que tornam essa escolha ainda mais especial.",
            price = 85.00,
        ),
        Dishes(
            id = 4,
            name = "Picanha Grelhada com Macaxeira Frita",
            image = R.drawable.prato_04,
            description = "Uma refeição de dar água na boca! Picanha de primeira qualidade, grelhada à perfeição e servida com macaxeira frita crocante. Um prato que celebra o melhor da culinária brasileira.",
            price = 90.00,
        ),
        Dishes(
            id = 5,
            name = "Porção de Batatas Fritas com Molho",
            image = R.drawable.prato_05,
            description = "Para os amantes de batatas, esta é a escolha ideal. Nossas batatas fritas são cortadas e preparadas na hora para garantir a crocância perfeita. Acompanhadas de uma variedade de molhos incríveis que vão tornar cada mordida ainda mais especial. Acompanhamento perfeito para qualquer refeição.",
            price = 20.00,
        ),
        Dishes(
            id = 6,
            name = "Suco de Laranja",
            image = R.drawable.bebida_01,
            description = "Um gole de pura refrescância e vitalidade. Nosso suco de laranja é feito com as laranjas mais suculentas e frescas, espremidas na hora para garantir o sabor cítrico e natural que todos adoram. Perfeito para acompanhar suas refeições ou para matar a sede a qualquer hora do dia. Deleite-se com o gosto da natureza em um copo.",
            price = 10.00,
        ),

    )

    fun getDishesById(id: Int) = dishes.find { it.id == id}

    fun getDishes() = dishes
}