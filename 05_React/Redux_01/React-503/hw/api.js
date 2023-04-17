import { createAsyncThunk, createSlice } from '@reduxjs/toolkit'
import axios from 'axios'

import { batch } from 'react-redux'

import { updateMood } from './mood'

const URL = "https://gist.githubusercontent.com/andasan/4f4976c373654f73b0a465a2441c2c91/raw/1b3c99936426b59ba4a92c7afe12fc109e4dbdcd/moods.json"

export const getMoods = createAsyncThunk(
    "cat/getMoods",
    async () => {
        const response = await axios.get(URL)
        return response.data.moodData
    }
)

export const fetchData = () => {

    return async (dispatch) => {
        try {
            const response = await axios.get(URL)

            batch(() => {
                dispatch(setMood(response.data.moodData))
                dispatch(setIsDataFetched())
            })
        } catch (error) {
            console.error(error)
        }
    }
}

const isDataFetchedSlice = createSlice({
  name: 'isDataFetched',
  initialState: false,
  reducers: {
      setIsDataFetched: (state, action) => true
  }
})

export const { setIsDataFetched } = isDataFetchedSlice.actions
export default isDataFetchedSlice.reducer