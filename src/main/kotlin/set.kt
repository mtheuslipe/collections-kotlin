val issues: MutableSet<String> = mutableSetOf("Disc1","Disc2", "Disc3")// criando um set mutável
val issuesCopy: Set<String> =issues// armazenando o set mutável em um outro set imutável

//função para adicionar um issue
fun addIssues(newIssue:String) = issues.add(newIssue)

//função para verificar se o issue já está no set ou não
fun vereficationAdd(obj: Boolean): String {
    if (obj) return "issue added successfully" else return "issue already in the Set, and this one was rejected and deleted"
}

//função de iteração do Set
fun verificationIssues(): Set<String> {
    return issuesCopy
}

fun main(){
    val newIssue: String = "Disc5"
    val alreadyInIssue: String = "Disc1"

    //chamando as funções
    println("first verification returns: ${vereficationAdd(addIssues(newIssue))}")
    println("second verification returns: ${vereficationAdd(addIssues(alreadyInIssue))}")
    println("we have ${verificationIssues().size} issues")

}