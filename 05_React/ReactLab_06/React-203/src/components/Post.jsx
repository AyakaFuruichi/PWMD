import React from 'react'
import '../index.css'

const Post = ({ image, content, user}) => {
  console.log(image)
  return (
    <div className=' m-4 p-4 border border-gray-800 bg-orange-200 rounded w-1/5'>
      {image && (
        <img
          className=' text-center'
          src={URL.createObjectURL(image)}
          alt="post-cover"
          style={{ height: 100, width: 200, objectFit: "cover" }}
        />
      )}
      <p className=' text-center text-black' >{content}</p>
      <div className=' text-center text-black'>
        <span className=' text-xs text-slate-600'>posted by </span>{user}
      </div>
    </div>
  )
}

export default Post