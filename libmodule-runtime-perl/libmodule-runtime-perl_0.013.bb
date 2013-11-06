SUMMARY = "Module::Runtime - runtime module handling"
AUTHOR = "Andrew Main (Zefram) <zefram@fysh.org>"
HOMEPAGE = "https://metacpan.org/module/Module::Runtime"
SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0+"
LIC_FILES_CHKSUM = "file://README;md5=f62b75558ab2b0fe9b624cd94f9a646a"

SRC_URI = "http://cpan.metacpan.org/authors/id/Z/ZE/ZEFRAM/Module-Runtime-0.013.tar.gz"
SRC_URI[md5sum] = "62b88b1f5f0e975a5d7c80cd46167b97"
SRC_URI[sha256sum] = "ec37e03d90dc905679dab62a82f42cf0897ed79244b87fd9d531438dc3c31023"

S = "${WORKDIR}/Module-Runtime-${PV}"

do_configure_prepend () {
	sed -i 's:\./configure\(.[^-]\):./configure --build=${BUILD_SYS} --host=${HOST_SYS} --target=${TARGET_SYS} --prefix=${prefix} --exec_prefix=${exec_prefix} --bindir=${bindir} --sbindir=${sbindir} --libexecdir=${libexecdir} --datadir=${datadir} --sysconfdir=${sysconfdir} --sharedstatedir=${sharedstatedir} --localstatedir=${localstatedir} --libdir=${libdir} --includedir=${includedir} --oldincludedir=${oldincludedir} --infodir=${infodir} --mandir=${mandir}\1:' Build.PL
	sed -i 's:\./configure\(.[^-]\):./configure --build=${BUILD_SYS} --host=${HOST_SYS} --target=${TARGET_SYS} --prefix=${prefix} --exec_prefix=${exec_prefix} --bindir=${bindir} --sbindir=${sbindir} --libexecdir=${libexecdir} --datadir=${datadir} --sysconfdir=${sysconfdir} --sharedstatedir=${sharedstatedir} --localstatedir=${localstatedir} --libdir=${libdir} --includedir=${includedir} --oldincludedir=${oldincludedir} --infodir=${infodir} --mandir=${mandir}\1:' Makefile.PL
}

inherit cpan_build

BBCLASSEXTEND = "native"
# do_compile() {
#     perl Makefile.PL BASE_DIR=${D} DESTDIR=${D} INSTALL_BIN=${bindir} LIBDIR=${libdir} BASELIBDIR=${base_libdir} MANDIR=${mandir} DATADIR=${datadir}
#     perl Build build 
# }

# do_install() {
#      perl Build install #--install-base ${D}
# }



