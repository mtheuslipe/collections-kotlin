val systemUsers: MutableList<Int> = mutableListOf<Int>(1,2,3)//gerando uma lista  mutável
val sudoers: List<Int> = systemUsers //armazenando a lista mutável em uma lista imutável

//função para adicionar dados na lista mutável
fun addUsers(number: Int){
    systemUsers.add(number)
}
//função para fazer o "report" da lista a partir da leitura da lista cópia imutável
fun usersReport(): List<Int> {
    return sudoers
}

fun main(){
    usersReport()//chamando a função de "report" inicial
    //adicionando usuários
    addUsers(4)
    addUsers(5)
    //quantificando a lista
    println("a quantidade de usuários é: ${usersReport().size}")

    //loop de repetição com a lista imutável
    for (i in sudoers)  println("important info about: $i")
}