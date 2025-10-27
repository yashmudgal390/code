import { useFormik } from 'formik';

const validate = values => {
  const errors = {};
  if (!values.username) {
    errors.username = 'Required';
  }
  if (!values.review) {
    errors.review = 'Required';
  }
  if (!values.rating) {
    errors.rating = 'Required';
  }
  return errors;
};

export default function CommentForm({ AddNewComment }) {
  const formik = useFormik({
    initialValues: {
      username: '',
      review: '',
      rating: '',
    },
    validate,
    onSubmit: (values, { resetForm }) => {
      AddNewComment(values);
      resetForm();
      console.log("✅ Comment added:", values);
    },
  });

  return (
    <div>
      <h4>Leave Review</h4>
      <form onSubmit={formik.handleSubmit}>
        <input
          placeholder="Username"
          name="username"
          type="text"
          onChange={formik.handleChange}
          value={formik.values.username}
        />
        {formik.errors.username && (
          <div style={{ color: "red" }}>{formik.errors.username}</div>
        )}
        <br />
        <br />

        <textarea
          placeholder="Review"
          name="review"
          onChange={formik.handleChange}
          value={formik.values.review}
        />
        {formik.errors.review && (
          <div style={{ color: "red" }}>{formik.errors.review}</div>
        )}
        <br />
        <br />

        <input
          placeholder="Rating"
          name="rating"
          type="number"
          min={0}
          max={5}
          onChange={formik.handleChange}
          value={formik.values.rating}
        />
        {formik.errors.rating && (
          <div style={{ color: "red" }}>{formik.errors.rating}</div>
        )}
        <br />
        <br />

        <button type="submit">Submit</button>
      </form>
    </div>
  );
}
