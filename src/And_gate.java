public  class And_gate extends Gate_2_input{
    And_gate() {
    }
    @Override
    public void activate(){
        this.output = this.input1 & this.input2;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + "sortie : " + this.output;
    }

}
