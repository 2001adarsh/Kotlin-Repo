var nodes : MutableList<Int> = mutableListOf()
var adj : MutableList<MutableList<Pair<Int, Int>>> = mutableListOf()

fun dfs(u:Int):Unit{
    nodes[u] = 1
    print("$u ")
    (0 until adj[u].size).forEach {
        val link = adj[u][it]
        if(nodes[link.first] == 0)
            dfs(link.first)
    }
}

fun main(){
    var NoOfnodes = readLine()!!.toInt()
    var edges = readLine()!!.toInt()

    (0 until NoOfnodes).forEach { nodes.add(0) }
    (0 until NoOfnodes).forEach { adj.add(mutableListOf()) }

    (0 until NoOfnodes).forEach { nodes[it] = 0 }
    (0 until edges).forEach {
        val (parent, child) = readLine()!!.split(" ").map { it.toInt() }
        adj[parent].add(Pair(child, 1))
        adj[child].add(Pair(parent, 1))
    }
    dfs(0)

}