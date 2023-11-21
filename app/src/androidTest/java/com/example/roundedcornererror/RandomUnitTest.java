package com.example.roundedcornererror;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.google.android.material.bottomsheet.BottomSheetBehavior;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

@RunWith(AndroidJUnit4.class)
public class RandomUnitTest {

    @Test
    public void noClassFound() {
        Mockito.mock(BottomSheetBehavior.class);
    }
}
