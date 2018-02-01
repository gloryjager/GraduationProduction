///*
// * Copyright (C) Daito Trust Construction Co., Ltd. All Rights Reserved.
// */
//
//package net.kentaku.app.di
//
//import android.content.Context
//import com.squareup.moshi.Moshi
//import com.squareup.moshi.Types
//import dagger.Module
//import dagger.Provides
//import net.kentaku.area.model.City
//import net.kentaku.area.model.Prefecture
//import net.kentaku.core.di.ApplicationScope
//import net.kentaku.core.store.SharedPreferenceStore
//import net.kentaku.core.store.TemporaryStore
//import net.kentaku.property.model.Property
//import net.kentaku.property.model.PropertyDetail
//import net.kentaku.property.model.search.*
//import net.kentaku.propertysearch.model.KeywordSuggestion
//import net.kentaku.trader.model.search.TraderSearchCondition
//
///**
// * Created by tsuyosh on 17/11/27.
// */
//@Module
//class ActivityResultStoreModule {
//    @ApplicationScope
//    @Provides
//    fun providesPrefectureResultStore(context: Context, moshi: Moshi): TemporaryStore<Prefecture> {
//        val sharedPreferences = context.getSharedPreferences("prefectureStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<Prefecture>(Prefecture::class.java)
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesCitiesResultStore(context: Context, moshi: Moshi): TemporaryStore<List<City>> {
//        val sharedPreferences = context.getSharedPreferences("citiesStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<List<City>>(Types.newParameterizedType(List::class.java, City::class.java))
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesPropertyFilterConditionResultStore(context: Context, moshi: Moshi): TemporaryStore<PropertyFilterCondition> {
//        val sharedPreferences = context.getSharedPreferences("propertyFilterConditionStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<PropertyFilterCondition>(PropertyFilterCondition::class.java)
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesPropertySearchRangeStore(context: Context, moshi: Moshi): TemporaryStore<PropertySearchRange> {
//        val sharedPreferences = context.getSharedPreferences("propertySearchRangeStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<PropertySearchRange>(PropertySearchRange::class.java)
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesPropertySearchConditionStore(context: Context, moshi: Moshi): TemporaryStore<PropertySearchCondition> {
//        val sharedPreferences = context.getSharedPreferences("propertySearchConditionStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<PropertySearchCondition>(PropertySearchCondition::class.java)
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesLineStationsStore(context: Context, moshi: Moshi): TemporaryStore<List<LineAndStations>> {
//        val sharedPreferences = context.getSharedPreferences("lineStationsStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<List<LineAndStations>>(
//                Types.newParameterizedType(List::class.java, LineAndStations::class.java))
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesKeywordSuggestionStore(context: Context, moshi: Moshi): TemporaryStore<KeywordSuggestion> {
//        val sharedPreferences = context.getSharedPreferences("keywordSuggestionStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<KeywordSuggestion>(KeywordSuggestion::class.java)
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesPropertiesStore(context: Context, moshi: Moshi): TemporaryStore<List<Property>> {
//        val sharedPreferences = context.getSharedPreferences("propertiesStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<List<Property>>(
//                Types.newParameterizedType(List::class.java, Property::class.java))
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesCommutingConditionsStore(context: Context, moshi: Moshi): TemporaryStore<List<CommutingCondition>> {
//        val sharedPreferences = context.getSharedPreferences("commutingConditionsStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<List<CommutingCondition>>(
//                Types.newParameterizedType(List::class.java, CommutingCondition::class.java))
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesPropertyDetailStore(context: Context, moshi: Moshi): TemporaryStore<PropertyDetail> {
//        val sharedPreferences = context.getSharedPreferences("propertyDetailStore", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<PropertyDetail>(PropertyDetail::class.java)
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//
//    @ApplicationScope
//    @Provides
//    fun providesTraderSearchConditionStore(context: Context, moshi: Moshi): TemporaryStore<TraderSearchCondition> {
//        val sharedPreferences = context.getSharedPreferences("traderSearchCondition", Context.MODE_PRIVATE)
//        val adapter = moshi.adapter<TraderSearchCondition>(TraderSearchCondition::class.java)
//        return SharedPreferenceStore(sharedPreferences, adapter)
//    }
//}