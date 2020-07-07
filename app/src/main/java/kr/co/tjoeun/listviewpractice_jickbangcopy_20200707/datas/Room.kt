package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas

class Room(
    val price:Int,
    val address:String,
    val floor:Int,
    val description:String) {

    fun getFormattedPrice() : String {
//        1억이 넘냐 아니냐에 따라 다르게 가공.
        if (this.price >= 10000) {

//            ?억 ?만원 양식으로 가공
//            몇억? 89999 / 10000 => 8.9999 (Int - 소수점 버림) => 8억
//            몇만원? 89999 % 10000 => 9999
            val uk = this.price / 10000
            val rest  = this.price % 10000

            return String.format("%,d억 %,d만원", uk, rest)
        }
        else {
//            1억이 안되는경우 => 8,500만원 등으로 가공.
//            숫자에 컴마, 만원붙이기.
            return String.format("%,d만원", this.price)
        }
    }

}