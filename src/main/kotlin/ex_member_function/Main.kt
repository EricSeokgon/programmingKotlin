package ex_member_function

fun main(args: Array<String>) {
    val building = Building()
    building.name = "A 오피스텔"
    building.date = "2021-08-25"
    building.area = 120 * 8

    building.print()
}