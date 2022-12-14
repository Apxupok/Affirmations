/*
 * Copyright (C) 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.affirmations.data
import com.example.affirmations.R
import com.example.affirmations.model.Affirmation
import com.example.affirmations.model.MyClass

/**
 * [Datasource] generates a list of [Affirmation]
 */
class Datasource() {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1,"new1 String"),
            Affirmation(R.string.affirmation2, R.drawable.image2,"new2 String"),
            Affirmation(R.string.affirmation3, R.drawable.image3,"new3 String"),
            Affirmation(R.string.affirmation4, R.drawable.image4,"new4 String"),
            Affirmation(R.string.affirmation5, R.drawable.image5,"new5 String"),
            Affirmation(R.string.affirmation6, R.drawable.image6,"new6 String"),
            Affirmation(R.string.affirmation7, R.drawable.image7,"new7 String"),
            Affirmation(R.string.affirmation8, R.drawable.image8,"new9 String"),
            Affirmation(R.string.affirmation9, R.drawable.image9,"new9 String"),
            Affirmation(R.string.affirmation10, R.drawable.image10,"new10 String"),
            Affirmation(R.string.affirmation11, R.drawable.image11,"new11 String")
        )
    }
    fun myFun(): List<MyClass>{
        return listOf<MyClass>(
            MyClass(10),
            MyClass(9),
            MyClass(8),
            MyClass(7),
            MyClass(6),
            MyClass(5),
            MyClass(4),
            MyClass(3),
            MyClass(2),
            MyClass(1),
            MyClass(0),
        )
    }
}
