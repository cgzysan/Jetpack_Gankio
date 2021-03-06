package io.jetpack.ysan.gankio.mvp.contract

import io.jetpack.ysan.gankio.base.IBaseView
import io.jetpack.ysan.gankio.base.IPresenter
import io.jetpack.ysan.gankio.mvp.model.entity.ReadCategoriesEntity


/**
 * Created by YSAN on 2019-05-13
 */
interface ReadContract {

    interface View: IBaseView {

        /**
         * 错误信息
         */
        fun showError(msg: String, errorCode: Int)

        /**
         *  设置 tab 数据
         */
        fun setTabData(results: ArrayList<ReadCategoriesEntity>)
    }

    interface Presenter: IPresenter<View> {

        /**
         * 获取闲读分类
         */
        fun requestCategories()
    }
}