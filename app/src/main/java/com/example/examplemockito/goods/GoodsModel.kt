package com.example.examplemockito.goods

import com.example.examplemockito.data.Goods


class GoodsModel : GoodsContract.Model {
    override fun getGoods(goodsId: Int): Goods {
        val goods = Goods()
        if (goodsId == 1) {
            goods.name = "A"
        } else if (goodsId == 2) {
            goods.name = "B"
        }
        return goods
    }

    override val goodsList: List<Goods>
        get() {
            val list: MutableList<Goods> = ArrayList()
            for (i in 0..9) {
                list.add(Goods("C", 10))
            }
            return list
        }
}