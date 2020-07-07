package kr.co.tjoeun.listviewpractice_jickbangcopy_20200707

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.adapters.RoomAdapter
import kr.co.tjoeun.listviewpractice_jickbangcopy_20200707.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        mRoomList.add(Room(8000, "서울시 마포구", 5, "첫번째 방 입니다."))
        mRoomList.add(Room(25000, "서울시 마포구", 0, "두번째 방 입니다."))
        mRoomList.add(Room(7800, "서울시 마포구", -1, "세번째 방 입니다."))
        mRoomList.add(Room(53000, "서울시 강서구", 2, "네번째 방 입니다."))
        mRoomList.add(Room(27000, "서울시 강서구", 3, "다섯번째 방 입니다."))
        mRoomList.add(Room(15000, "서울시 강서구", 0, "여섯번째 방 입니다."))
        mRoomList.add(Room(4000, "서울시 종로구", -2, "일곱번째 방 입니다."))
        mRoomList.add(Room(3000, "서울시 종로구", 7, "여덟번째 방 입니다."))
        mRoomList.add(Room(44000, "서울시 종로구", 15, "아홉번째 방 입니다."))

        mRoomAdapter = RoomAdapter(mContext, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

    }

}