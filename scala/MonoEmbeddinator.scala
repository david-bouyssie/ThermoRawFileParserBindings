package thermorawfileparser.bindings

import scala.scalanative._
import scala.scalanative.native._

@native.link("ThermoRawFileParser")
@native.extern
object MonoEmbeddinator {
  type enum_mono_embeddinator_error_type_t = native.CUnsignedInt
  object enum_mono_embeddinator_error_type_t {
    final val MONO_EMBEDDINATOR_OK: enum_mono_embeddinator_error_type_t = 0.toUInt
    final val MONO_EMBEDDINATOR_EXCEPTION_THROWN: enum_mono_embeddinator_error_type_t = 1.toUInt
    final val MONO_EMBEDDINATOR_ASSEMBLY_OPEN_FAILED: enum_mono_embeddinator_error_type_t = 2.toUInt
    final val MONO_EMBEDDINATOR_CLASS_LOOKUP_FAILED: enum_mono_embeddinator_error_type_t = 3.toUInt
    final val MONO_EMBEDDINATOR_METHOD_LOOKUP_FAILED: enum_mono_embeddinator_error_type_t = 4.toUInt
    final val MONO_EMBEDDINATOR_MONO_RUNTIME_MISSING_SYMBOLS: enum_mono_embeddinator_error_type_t = 5.toUInt
  }

  type __uint32_t = native.CUnsignedInt
  type uint32_t = __uint32_t
  type struct_MonoEmbedObject = native.CStruct2[native.Ptr[MonoClass], uint32_t]
  type MonoEmbedObject = struct_MonoEmbedObject
  type struct__MonoAssembly = native.CStruct0 // incomplete type
  type MonoAssembly = struct__MonoAssembly
  type struct__MonoImage = native.CStruct0 // incomplete type
  type MonoImage = struct__MonoImage
  type struct__MonoClass = native.CStruct0 // incomplete type
  type MonoClass = struct__MonoClass
  type struct__MonoDomain = native.CStruct0 // incomplete type
  type MonoDomain = struct__MonoDomain
  type struct__MonoObject = native.CStruct0 // incomplete type
  type MonoObject = struct__MonoObject
  type struct__MonoMethod = native.CStruct0 // incomplete type
  type MonoMethod = struct__MonoMethod
  type struct__MonoException = native.CStruct0 // incomplete type
  type MonoException = struct__MonoException
  type struct_mono_embeddinator_context_t = native.CStruct1[native.Ptr[MonoDomain]]
  type mono_embeddinator_context_t = struct_mono_embeddinator_context_t
  type mono_embeddinator_assembly_load_hook_t = native.CFunctionPtr1[native.CString, native.Ptr[MonoAssembly]]
  type mono_embeddinator_error_type_t = enum_mono_embeddinator_error_type_t
  type struct_mono_embeddinator_error_t = native.CStruct3[mono_embeddinator_error_type_t, native.Ptr[MonoException], native.CString]
  type mono_embeddinator_error_t = struct_mono_embeddinator_error_t
  type mono_embeddinator_error_report_hook_t = native.CFunctionPtr1[mono_embeddinator_error_t, Unit]
  def mono_embeddinator_init(ctx: native.Ptr[mono_embeddinator_context_t], domain: native.CString): native.CInt = native.extern
  def mono_embeddinator_destroy(ctx: native.Ptr[mono_embeddinator_context_t]): native.CInt = native.extern
  def mono_embeddinator_get_context(): native.Ptr[mono_embeddinator_context_t] = native.extern
  def mono_embeddinator_set_assembly_path(path: native.CString): Unit = native.extern
  def mono_embeddinator_set_runtime_assembly_path(path: native.CString): Unit = native.extern
  def mono_embeddinator_set_context(ctx: native.Ptr[mono_embeddinator_context_t]): Unit = native.extern
  def mono_embeddinator_load_assembly(ctx: native.Ptr[mono_embeddinator_context_t], assembly: native.CString): native.Ptr[MonoImage] = native.extern
  def mono_embeddinator_search_assembly(assembly: native.CString): native.CString = native.extern
  def mono_embeddinator_install_assembly_load_hook(hook: native.CFunctionPtr1[native.CString, native.Ptr[MonoAssembly]]): native.CFunctionPtr1[native.CString, native.Ptr[MonoAssembly]] = native.extern
  def mono_embeddinator_search_class(assembly: native.CString, _namespace: native.CString, name: native.CString): native.Ptr[MonoClass] = native.extern
  def mono_embeddinator_lookup_method(method_name: native.CString, klass: native.Ptr[MonoClass]): native.Ptr[MonoMethod] = native.extern
  def mono_embeddinator_throw_exception(exception: native.Ptr[MonoObject]): Unit = native.extern
  def mono_embeddinator_error_ptr_to_string(error: native.Ptr[mono_embeddinator_error_t]): native.CString = native.extern
  def mono_embeddinator_install_error_report_hook(hook: native.CFunctionPtr1[mono_embeddinator_error_t, Unit]): native.Ptr[Byte] = native.extern
  def mono_embeddinator_create_object(instance: native.Ptr[MonoObject]): native.Ptr[Byte] = native.extern
  def mono_embeddinator_init_object(`object`: native.Ptr[MonoEmbedObject], instance: native.Ptr[MonoObject]): Unit = native.extern
  def mono_embeddinator_destroy_object(`object`: native.Ptr[MonoEmbedObject]): Unit = native.extern
  def mono_embeddinator_get_cultureinfo_invariantculture_object(): native.Ptr[MonoObject] = native.extern
  def mono_embeddinator_get_decimal_class(): native.Ptr[MonoClass] = native.extern
  def mono_embeddinator_get_datetime_class(): native.Ptr[MonoClass] = native.extern

  object implicits {
    implicit class struct_mono_embeddinator_context_t_ops(val p: native.Ptr[struct_mono_embeddinator_context_t]) extends AnyVal {
      def domain: native.Ptr[MonoDomain] = !p._1
      def domain_=(value: native.Ptr[MonoDomain]): Unit = !p._1 = value
    }

    implicit class struct_mono_embeddinator_error_t_ops(val p: native.Ptr[struct_mono_embeddinator_error_t]) extends AnyVal {
      def `type`: mono_embeddinator_error_type_t = !p._1
      def `type_=`(value: mono_embeddinator_error_type_t): Unit = !p._1 = value
      def exception: native.Ptr[MonoException] = !p._2
      def exception_=(value: native.Ptr[MonoException]): Unit = !p._2 = value
      def string: native.CString = !p._3
      def string_=(value: native.CString): Unit = !p._3 = value
    }

    implicit class struct_MonoEmbedObject_ops(val p: native.Ptr[struct_MonoEmbedObject]) extends AnyVal {
      def _class: native.Ptr[MonoClass] = !p._1
      def _class_=(value: native.Ptr[MonoClass]): Unit = !p._1 = value
      def _handle: uint32_t = !p._2
      def _handle_=(value: uint32_t): Unit = !p._2 = value
    }
  }

  object struct_mono_embeddinator_context_t {
    import implicits._
    def apply()(implicit z: native.Zone): native.Ptr[struct_mono_embeddinator_context_t] = native.alloc[struct_mono_embeddinator_context_t]
    def apply(domain: native.Ptr[MonoDomain])(implicit z: native.Zone): native.Ptr[struct_mono_embeddinator_context_t] = {
      val ptr = native.alloc[struct_mono_embeddinator_context_t]
      ptr.domain = domain
      ptr
    }
  }

  object struct_mono_embeddinator_error_t {
    import implicits._
    def apply()(implicit z: native.Zone): native.Ptr[struct_mono_embeddinator_error_t] = native.alloc[struct_mono_embeddinator_error_t]
    def apply(`type`: mono_embeddinator_error_type_t, exception: native.Ptr[MonoException], string: native.CString)(implicit z: native.Zone): native.Ptr[struct_mono_embeddinator_error_t] = {
      val ptr = native.alloc[struct_mono_embeddinator_error_t]
      ptr.`type` = `type`
      ptr.exception = exception
      ptr.string = string
      ptr
    }
  }

  object struct_MonoEmbedObject {
    import implicits._
    def apply()(implicit z: native.Zone): native.Ptr[struct_MonoEmbedObject] = native.alloc[struct_MonoEmbedObject]
    def apply(_class: native.Ptr[MonoClass], _handle: uint32_t)(implicit z: native.Zone): native.Ptr[struct_MonoEmbedObject] = {
      val ptr = native.alloc[struct_MonoEmbedObject]
      ptr._class = _class
      ptr._handle = _handle
      ptr
    }
  }
}

