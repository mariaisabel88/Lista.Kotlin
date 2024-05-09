class ContaCorrente(var numerodaConta: int, var saldo double) {
    fun depositar(valor double) { 
        saldo+= valor 
    }
    
    fun sacar(valor: double){
        saldo+= valor 
    }
    
}
