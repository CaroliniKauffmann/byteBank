fun main() {
    println("Bem vindo ao ByteBank!")
    val contaJoel = Conta()
    contaJoel.titular = "Joel"
    contaJoel.numero = 9536
    contaJoel.saldo = 200.00

    val contaCarol = Conta()
    contaCarol.titular = "Carol"
    contaCarol.numero = 9569
    contaCarol.saldo = 250.0


    println(contaJoel.titular)
    println(contaJoel.numero)
    println(contaJoel.saldo)


    println(contaCarol.titular)
    println(contaCarol.numero)
    println(contaCarol.saldo)

    println("Depositando na conta do Joel: ")
    deposita(contaJoel, 500.0)
    println(contaJoel.saldo)

    println("Depositando na conta da Carol: ")
    deposita(contaCarol, 100.0)
    println(contaCarol.saldo)

}

fun deposita(conta: Conta, valor: Double) {
    conta.saldo += valor

}
class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

}

fun testaCopiasEReferencias(){


    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    var contaMaria = contaJoao
    contaMaria.titular = "Maria"

    println("titular conta joao: ${contaJoao.titular}")
    println("titular conta maria: ${contaMaria.titular}")

    println(contaJoao)
    println(contaMaria)

}


