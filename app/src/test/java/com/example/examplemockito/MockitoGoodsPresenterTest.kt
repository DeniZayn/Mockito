package com.example.examplemockito

import com.example.examplemockito.goods.GoodsContract
import com.example.examplemockito.goods.GoodsPresenter
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner


@RunWith(MockitoJUnitRunner::class)
class MockitoGoodsPresenterTest {
    private var presenter: GoodsPresenter? = null

    @Mock
    var view: GoodsContract.View? = null
    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = GoodsPresenter()
        presenter!!.attachView(view!!)
    }

    @Test
    fun testGetGoods() {
        val goods = presenter!!.getGoods(1)
        assert(goods.name == "1")
    }
}