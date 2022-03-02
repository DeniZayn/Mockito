package com.example.examplemockito.goods

import com.example.examplemockito.base.BasePresenter
import com.example.examplemockito.base.BaseView
import com.example.examplemockito.data.Goods

interface GoodsContract {

    interface Model {

        val goodsList: List<Goods>

        fun getGoods(goodsId: Int): Goods

    }

    interface View : BaseView {

        fun onGoodsRequested(result: Goods)

    }

    abstract class Presenter : BasePresenter<View>() {

        abstract fun getGoods(goodsId: Int): Goods

        abstract fun requestGoods(goodsId: Int)

    }


}