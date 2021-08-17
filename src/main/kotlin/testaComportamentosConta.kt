fun testaComportamentosConta() {
    val contaAlex = Conta()
    contaAlex.titular = "Alex"
    contaAlex.numero = 1000
    contaAlex.setSaldo(-200.0)

    val contaFran = Conta()
    contaFran.titular = "Fran"
    contaFran.numero = 1001
    contaFran.setSaldo(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.getSaldo())

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.getSaldo())

//    println("depositando na conta do Alex")
//    contaAlex.deposita(50.0)
//    println(contaAlex.saldo)
//
//    println("depositando na conta da Fran")
//    contaFran.deposita(70.0)
//    println(contaFran.saldo)
//
//    println("sacando na conta do Alex")
//    contaAlex.saca(250.0)
//    println(contaAlex.saldo)
//
//    println("sacando na conta da Fran")
//    contaFran.saca(100.0)
//    println(contaFran.saldo)
//
//    println("saque em excesso na conta do Alex")
//    contaAlex.saca(100.0)
//    println(contaAlex.saldo)
//
//    println("saque em excesso na conta da Fran")
//    contaFran.saca(500.0)
//    println(contaFran.saldo)
//
//    println("Transferência da conta da Fran para o Alex")
//
//    if(contaFran.transfere(300.0, contaAlex)){
//        println("Transferência sucedida")
//    } else {
//        println("Falha na transferência")
//    }
//
//    println(contaAlex.saldo)
//    println(contaFran.saldo)
}