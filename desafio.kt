enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val name: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>(Usuario("Henrique"))
    
    fun matricular(novoFulano: Usuario) {
        inscritos.add(novoFulano)
        println(inscritos)
        println(novoFulano)
    }
}

fun cursosDisponiveis(obj: Int) : String {
    val result = when (obj) {
        1 -> "BootCamp kotlin"
        2 -> "BootCamp Java"
        3 -> "BootCamp Front-End"
        else -> "Escolha um Curso"
    }
    return result
}

fun main() {
    
    var curso = 3
    
    println(cursosDisponiveis(curso))       
    
    val conteudo1 = ConteudoEducacional("Apresentacao", 80)
    val conteudo2 = ConteudoEducacional("Principiso de Desenvolvimento", 90)
    val conteudo3 = ConteudoEducacional("Conhecendo a Linguagem", 100)
    
    var conteudos = mutableListOf(conteudo1, conteudo2, conteudo3)
    
    //para eu ter um novo Usuario preciso já ter a formação com seu respectivo conteúdo
    
 	 Formacao(cursosDisponiveis(1), conteudos).matricular(Usuario("George"))
    
    
    val nivel = Nivel.BASICO
    
    val nivelDaFormacao = when (nivel) {
        Nivel.BASICO -> "Nivel Básico"
        Nivel.INTERMEDIARIO -> "Nivel Intermediario"
        Nivel.DIFICIL -> "Nivel Avançado"
    }
    println(nivelDaFormacao)
}
