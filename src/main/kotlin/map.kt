const val POINTS_ADDED= 15 //declarando constante que será usada em uma das funções
val accountsPoints: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 200, 3 to 100)// map mutável
val accountsPointsReport: Map<Int, Int> = accountsPoints // map mutável dentro do map imutável

//função para verificar existência da conta seleiconada e adicionar pontos se for válida
fun addingPoints(accountId: Int) {
    if (accountsPoints.containsKey(accountId)) {
        println("updating points to account $accountId")
        accountsPoints[accountId] = accountsPoints.getValue(accountId) + POINTS_ADDED
    } else {
        println("Error: please insert a valid ID (id: $accountId")
    }
}

//função de iteração do map a partir do map de leitura apenas
fun reportPoints(): Map<Int, Int>{
    return accountsPointsReport
}

fun main(){
    //chamando as funções com valores pré-definidos
    println(reportPoints().size)
    addingPoints(1)
    addingPoints(1)
    addingPoints(5)
    println(reportPoints().size)
}
