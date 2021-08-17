fun main() {
    println("Bem vindo ao Bytebank")
    testaComportamentosConta()
    val carol = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0
    )

    println("nome ${carol.nome}")
    println("cpf ${carol.cpf}")
    println("salario ${carol.salario}")
    println("bonificação ${carol.bonificacao}")

    val joel = Gerente(
        nome = "Joel",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234
    )

    println("nome ${joel.nome}")
    println("cpf ${joel.cpf}")
    println("salario ${joel.salario}")
    println("bonificação ${joel.bonificacao}")

    if(joel.autentica(1234)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

    val ana = Diretor(
        nome = "Ana",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )

    println("nome ${ana.nome}")
    println("cpf ${ana.cpf}")
    println("salario ${ana.salario}")
    println("bonificação ${ana.bonificacao}")
    println("plr ${ana.plr}")

    if(joel.autentica(4000)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }

}


