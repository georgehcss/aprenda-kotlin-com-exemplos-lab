enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(var name: String) // Representa um aluno da DIO

data class ConteudoEducacional(var nome: String, val duracao: Int = 60, val nivel: Nivel) // Adiciona o atributo nivel para o conteúdo

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>(Usuario("Henrique"))
    
    fun matricular(usuario: Usuario) { // adiona o novo usuario na Lista de inscritos
        inscritos.add(usuario)
    }

    fun listarConteudos() { // Adiciona um método para listar os conteúdos da formação
        println("A formação $nome possui os seguintes conteúdos:")
        for (conteudo in conteudos) {
            println("- ${conteudo.nome} (Duração de ${conteudo.duracao} minutos) nível ${conteudo.nivel}") // Imprime o nível do conteúdo
        }
    }
}

fun main() {
    
    // Cria alguns conteúdos educacionais com os respectivos níveis
    val conteudo1 = ConteudoEducacional("Apresentacao", 80, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Principios de Desenvolvimento", 90, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Conhecendo a Linguagem", 100, Nivel.DIFICIL)
    
    // Cria uma lista de conteúdos
    var conteudos = mutableListOf(conteudo1, conteudo2, conteudo3)

    // Cria uma formação com os conteúdos e o nível
    val formacao = Formacao("BootCamp kotlin", conteudos, Nivel.INTERMEDIARIO)

    // Matricula um usuário na formação
    formacao.matricular(Usuario("George"))

    // Lista os conteúdos da formação
    formacao.listarConteudos() 
       
}
