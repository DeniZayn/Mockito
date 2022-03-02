package com.example.examplemockito.goods

import android.os.Bundle
import android.widget.TextView
import com.example.examplemockito.R
import com.example.examplemockito.base.BaseActivity
import com.example.examplemockito.data.Goods
import com.example.examplemockito.goods.GoodsContract.Presenter
import kotlinx.android.synthetic.main.activity_goods.*


class GoodsActivity : BaseActivity<GoodsContract.View, Presenter>(), GoodsContract.View {

    var tv: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goods)
        tv = findViewById(R.id.tv)

        btn_get_goods.setOnClickListener {
            val goods = mPresenter.getGoods(1)
            tv!!.text = goods.name
        }

        btn_request_goods.setOnClickListener {
            mPresenter.requestGoods(1)
        }

    }

    override fun onGoodsRequested(result: Goods) {
        tv!!.text = result.name
    }

    override fun createPresenter(): Presenter {
        return GoodsPresenter()
    }
}