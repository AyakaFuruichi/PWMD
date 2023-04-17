import { useEffect } from 'react'
import { Cat } from 'react-kawaii'
import { useSelector, useDispatch, batch } from 'react-redux'

import { getMoods } from './api'
import { updateMood, MOODS, addSize, decSize, updateColor } from './mood'

function App() {
  const currentMood = useSelector((state) => state.mood)
  const currentSize = useSelector((state) => state.size)
  const currentColor = useSelector((state) => state.color)

  const isDataFetched = useSelector((state) => state.isDataFetched)
  const dispatch = useDispatch()

  useEffect(() => {
    if (!isDataFetched) {
      // dispatch(fetchData())
      batch(() => {
        dispatch(getMoods())
      })
    }
  }, [])

  const handleMoodUpdate = (event) => {
    const mood = event.target.dataset.type
    dispatch(updateMood(mood))
  }

  const handleColorUpdate = (event) => {
    const color = event.target.value
    dispatch(updateColor(color))
  }

  return (
    <div className='App'>
      <Cat size={currentSize} mood={currentMood} color={currentColor} />
      <section>
        {Object.values(MOODS).map((mood) => (
          <button key={mood} data-type={mood} onClick={handleMoodUpdate}>
            {mood}
          </button>
        ))}

        <button
          className='btn btn-info m-1'
          onClick={() => dispatch(addSize())}>
            +
        </button>
        <button
          className='btn btn-success m-1'
          onClick={() => dispatch(decSize())}>
            -
        </button>

        <input type='color' onChange={handleColorUpdate}/>
      </section>
    </div>
  )
}

export default App